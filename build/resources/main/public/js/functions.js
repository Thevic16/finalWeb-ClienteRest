
function checkLogin(){
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    let url = 'http://localhost:7000/api/v1/login/';
    let data = { "username": username,"password":password };



    fetch(url, {
        method: 'POST', // or 'PUT'
        body: JSON.stringify(data), // data can be `string` or {object}!
        headers:{
            'Content-Type': 'application/json'
        }
    }).then(res => res.json())
        .catch(error => {console.error('Error:', error); alert("Usuario o contraseña incorrecto!"); })
        .then(response => {console.log('Success:', response); localStorage.setItem("token", response.token); window.location.reload(); });

}