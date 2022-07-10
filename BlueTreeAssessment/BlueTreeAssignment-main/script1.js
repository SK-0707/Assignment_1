
function validateEmployee(){

    let empName=document.getElementById("empName").value;
    let email=document.getElementById("email").value;
    let dob=document.getElementById("dob").value;
    let salary=document.getElementById("salary").value;
    let status=document.getElementById("status").value;

    let currentDate = new Date();
    let birth=new Date(dob);
    let age= currentDate.getFullYear()-birth.getFullYear();
    console.log(age);

    let employee={
        empName:empName,
        email:email,
        dob:dob,
        age:age,
        salary:salary,
        status:status
    }
    
    console.log(employee);
   if(dob!="" && empName!="" && salary!=""){
    addEmployee(employee) 
   }
}

function addEmployee(employee) {
    axios.post("http://localhost:9012/bluetree/employee",employee)
    .then(response=>{
        alert("Employee Added Successfully")
       
    }).catch.catch(err=>
        {
            alert("Employee Adding "+err)
        })
}



getData = function () {
    axios.get("http://localhost:9012/bluetree/employee")
        .then(response => {
            let product = response.data;
            for (let i = 0; i < product.length; i++) {
                let mytr= document.createElement('tr');
                let td1 = document.createElement('td');
                let td2 = document.createElement('td');
                let td3 = document.createElement('td');
                let td4 = document.createElement('td');
                let td5 = document.createElement('td');
                let td6 = document.createElement('td');
                let td7 = document.createElement('td');
                let td8 = document.createElement('td');
                let delBtn = document.createElement('button');
                    delBtn.innerHTML="Delete";
                 delBtn.classList="btn btn-danger"
                 delBtn.addEventListener("click",del=function(){

                    axios.delete("http://localhost:9012/bluetree/employee/"+product[i].empId)
                    .then(response=>{
                        alert("Employee Removed Successfully")
                         window.reload()
                       
                    }).catch.catch(err=>
                        {
                            alert("Employee Removing "+err)
                        })
                
                 })

                td1.innerHTML=product[i].empId
                td2.innerHTML=product[i].empName
                td3.innerHTML=product[i].dob
                td4.innerHTML=product[i].age 
                td5.innerHTML=product[i].salary 
                td6.innerHTML=product[i].status
                td7.innerHTML=product[i].email
                td8.appendChild(delBtn)

               mytr.appendChild(td1)
               mytr.appendChild(td2)
               mytr.appendChild(td7)
               mytr.appendChild(td3)
               mytr.appendChild(td4)
               mytr.appendChild(td5)
               mytr.appendChild(td6)
               mytr.appendChild(td8)

               document.getElementById('t-body').appendChild(mytr)
            
            }
        })
        .catch(err=>
            {
                alert('Data Loading '+err)
            })
};



