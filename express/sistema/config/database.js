/*const { Sequelize } = require('sequelize');

const sequelize = new Sequelize('formulario', 'iago', 'entercode', {
  host: '192.168.18.8', // substitua pelo host do seu servidor MySQL
  dialect: 'mysql',
});
const sequelize = require('./config/database');
const User = require('./models/User');

// Sincronize os modelos com o banco de dados (isso cria as tabelas)
sequelize.sync()
  .then(() => {
    console.log('Tabelas criadas.');
  })
  .catch((err) => {
    console.error('Erro ao criar tabelas:', err);
  });
module.exports = sequelize;*/