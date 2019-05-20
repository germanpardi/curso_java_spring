/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

console.log("Generando tabla....");


var lista = new Array();

lista = [["Vaina:", "Peine", "15 euros",15]];
lista[1]= ["Vaina:", "Quitapelos","30",7];
lista[2]=["Vaina:","Coche", "200",2];

generarTabla();

function addRow(){
        console.log("entro");
        var nuevo = ["Vaina:", document.getElementById("descripcion").value,document.getElementById("precio").value, document.getElementById("stock").value];
        lista.push(nuevo);
        
        generarTabla();
        
}
function generarTabla(){
    
    var table = document.getElementsByTagName("table");
    table = table[0];
    table.innerHTML ="<caption>Lista de vainas</caption>";
    var nombrePrecio = "Precio";
    table.innerHTML += `
    <thead>
            <tr><th>Tipo</th>
                <th>Nombre</th>
                <th>${nombrePrecio}</th>
                <th>Stock</th></tr>

    </thead>
    `;
    
    
    
    //lista = [[document.getElementById("descripcion"),document.getElementsById("precio"),document.getElementById("stock")]];
    
    
    
    for(var i=0;i<lista.length;i++){
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]){
            var nodoCol= document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
            
        }
    }
}
function addRow2(){
    var table = document.getElementsByTagName("table");
    table = table[0];
    var nuevo = ["Vaina: ",document.getElementById("descripcion").value,document.getElementById("precio").value,document.getElementById("stock").value];
    var nodoTR = document.createElement("tr");
    table.appendChild(nodoTR);
    
    for(var dato of nuevo){
        var nodoTD = document.createElement("td");
        nodoTR.appendChild(nodoTD);
        var data = document.createTextNode(dato);
        nodoTD.appendChild(data);
    }
}
