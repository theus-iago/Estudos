const mongoose = require('mongoose')

const DB_USER =  'Ana'
const DB_PASSWORD= encodeURIComponent('123')
mongoose.connect('mongodb://127.0.0.1:27017/EEQSBD')
 .then(() =>{
    console.log("Banco de Dados MongoDB conectado com sucesso");
 })
 .catch(err => console.log(err))
/*const mysql = require('mysql2');

const db = mysql.createConnection({host:'192.168.18.8',user:'iago',password:'entercode',database:'formulario'});
db.connect((err) => {if(err) {console.error('Erro a9 conectar ao MYSQL:', err)
}else {
console.log('Conectado ao MYSQL');
}
});

module.exports = db;*/
