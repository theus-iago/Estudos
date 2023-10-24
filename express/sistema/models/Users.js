const mongoose = require('mongoose')

const User = mongoose.model('users', {
    name: String,
    age: Number,
    UF: String,
    acoes: String,
    senha: String
})

module.exports = User
/*const {DataTypes} = require('sequelize');
const sequelize = require('../config/database.js');

const User = sequelize.define('User', {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  nome: {
   type: DataTypes.STRING,
   allowNull:false,
  },
  idade: {
    type: DataTypes.INTEGER,
    allowNull:false,
  },
  cpf: {
    type: DataTypes.STRING,
    allowNull:false,
  },
  email: {
    type: DataTypes.STRING,
    allowNull:false,
  },
  senha: {
    type: DataTypes.STRING,
    allowNull:false,
  },
});

module.exports = User;*/