import L_CDE.L_CDE;

public class Main {
    public static void main(String[] args) {
      /*
        Lista_DE lista_DE=new Lista_DE();
        System.out.println(lista_DE.estaVacia());
        for (int i=20;i>0;i--){
            lista_DE.insertar(i);
        }
        System.out.println(lista_DE.estaVacia());
        lista_DE.mostrarAdelante();
        lista_DE.eliminar();
        lista_DE.eliminar();
        lista_DE.mostrarAdelante();
        lista_DE.mostrarAdelante();
         */
        /*
        Lista_CSE lista_cse=new Lista_CSE();
        System.out.println(lista_cse.estaVacia());
        for (int i=1;i<=12;i++){
            lista_cse.insertarFin(i);
        }
        lista_cse.mostrar();
        System.out.println(lista_cse.tamaño());
        //lista_cse.eliminarFin();
        //lista_cse.eliminarFin();
        //lista_cse.mostrar();
        lista_cse.mostraCircular(2);
        */
        L_CDE l_cde=new L_CDE();
        System.out.println(l_cde.estaVacia());
        for(int i=1;i<=5;i++){
            l_cde.insertarFinal(i);
        }
        l_cde.mostrar();
        l_cde.eliminarFinal();
        l_cde.eliminarFinal();
        l_cde.mostrar();
        l_cde.mostrarAdelante(4);
        l_cde.mostrarAdelante(4);
    }
}

