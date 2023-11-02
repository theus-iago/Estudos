async function obterDados(username) {
 try {
  const userData = await buscarDados(username);
  console.log("Dados do usuário:",userData);
 }catch (error) {
  console.error("Falha ao tentar obter os dados:",erro);
 }
}
function buscarDados(username) {
 return new Promise((resolve,reject) => {
  fetch(`https://api.github.com/users/${username}`)
  .then(response => {
   if(response.status === 200) {
    resolve(response.json());
   }else {
    reject(new Error("Falha ao tentar buscar os dados!"));
   }
  })
 .catch(error => {
  reject(error);
 });
 });
}
obterDados("theus-iago");
