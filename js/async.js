async function async() {
  try{
    const resultado = await promiseAsync();
    console.log(resultado);
  }catch (erro) {
    console.error(erro);
  }
}
function promiseAsync() {
 return new Promise((resolve,reject) => {
  setTimeout(() => {
    const sucesso = true;
    if(sucesso) {
      resolve("Ação executada com sucesso!");
    }else {
      reject("Erro!");
    }
  },2000);
});
}
async();