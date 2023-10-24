const body = document.querySelector("body");
async function async() {
  try {
    const resultado = await promise();
    window.alert(resultado);
  }catch (erro) {
    window.alert(erro);
  }
}
 function promise() {
   return new Promise((resolve,reject) => {
     setTimeout(() => {
       const sucesso = true;
       if(sucesso) {
         resolve("A operação foi executada com sucesso!");
       }else {
         reject("Ocorreu um erro durante a operação!");
       }
     },2000);
   });
 }
 async();