paquete  dobleenlazada ;

import  javax.swing.JOptionPane ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
el  principal de la clase  pública extiende javax.swing . JFrame {  

    ListaDoble lista =  nuevo  ListaDoble ();
    int elemento;
     principal público () {
        initComponents ();
    }
    private  void  BTNaddIncioActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            

        if ( TXTinsertar . getText () . length () ==  0 ) {
            JOptionPane . showMessageDialog ( nulo , " Ingrese un Dato " , " ERROR " , JOptionPane . QUESTION_MESSAGE );
        } else {
            Lista . addInicio ( Entero . parseInt ( TXTinsertar . getText ()));
            TXTinsertar . setText ( " " );
            JOptionPane . showMessageDialog ( null , " Elemento insertado al inicio " );
        }
    }                                           

    private  void  BTNaddFinActionPerformed ( java.awt.event . ActionEvent  evt ) {                                          
        if ( TXTinsertar . getText () . isEmpty ())
        {
            JOptionPane . showMessageDialog ( nulo , " Ingrese un Dato " , " ERROR " , JOptionPane . QUESTION_MESSAGE );
        } else {
            Lista . addFinal ( Entero . parseInt ( TXTinsertar . getText ()));
            TXTinsertar . setText ( " " );
            JOptionPane . showMessageDialog ( null , " Elemento insertado al final " );
        }
    }                                         

    private  void  BTNremoveInicioActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                
        si ( ! Lista . estaVacia ()) {
            elemento = lista . removeInicio ();
            JOptionPane . showMessageDialog ( null , " El elemento eliminado es: "  + elemento, " Eliminando .. " ,
                    JOptionPane . INFORMATION_MESSAGE );
        } else {
            JOptionPane . showMessageDialog ( nulo , " No hay Nodos aun .. !! " , " Lista Vacia " ,
                    JOptionPane . INFORMATION_MESSAGE );
        }
    }                                               

    private  void  BTNremoveFinalActionPerformed ( java.awt.event . ActionEvent  evt ) {                                               

        si ( ! Lista . estaVacia ()) {
            elemento = lista . removeFinal ();
            JOptionPane . showMessageDialog ( null , " El elemento eliminado es: "  + elemento, " Eliminando .. " ,
                    JOptionPane . INFORMATION_MESSAGE );
        } else {
            JOptionPane . showMessageDialog ( nulo , " No hay Nodos aun .. !! " , " Lista Vacia " ,
                    JOptionPane . INFORMATION_MESSAGE );
        }
    }                                              

    private  void  BTNremoveActionPerformed ( java.awt.event . ActionEvent  evt ) {                                          
        Lista . removeValor ( Entero . parseInt ( TXTeliminar . getText ()));
        JOptionPane . showMessageDialog ( nulo , " El elemento se a eliminado. " , " Eliminando .. " ,
                JOptionPane . INFORMATION_MESSAGE );
    }                                         

    private  void  BTNmostrarInicioActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                 
        si ( ! Lista . estaVacia ()) {
            Lista . mostrarInicioFin ();
        } else {
            JOptionPane . showMessageDialog ( nulo , " No hay Nodos aun .. !! " , " Lista Vacia " ,
                    JOptionPane . INFORMATION_MESSAGE );
        }
    }                                                

    private  void  BTNmostrarFinActionPerformed ( java.awt.event . ActionEvent  evt ) {                                              
        si ( ! Lista . estaVacia ()) {
            Lista . mostrarFinInicio ();
        } else {
            JOptionPane . showMessageDialog ( nulo , " No hay Nodos aun .. !! " , " Lista Vacia " ,
                    JOptionPane . INFORMATION_MESSAGE );
        }
    }                                             

    private  void  BTNbuscarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                          
        si ( ! Lista . estaVacia ()) {
            Lista . buscarValor ( Entero . parseInt ( TXTbuscar . getText ()));
            TXTbuscar . setText ( " " );
        } else {
            JOptionPane . showMessageDialog ( nulo , " No hay Nodos aun .. !! " , " Lista Vacia " ,
                    JOptionPane . INFORMATION_MESSAGE );
        }
    }                                         

    private  void  BTNmodificarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                             
        si ( ! Lista . estaVacia ()) {
            Lista . modificarValor ( Entero . parseInt ( TXTmodificar . getText ()));
            TXTmodificar . setText ( " " );
        } else {
            JOptionPane . showMessageDialog ( nulo , " No hay Nodos aun .. !! " , " Lista Vacia " ,
                    JOptionPane . INFORMATION_MESSAGE );
        }
    }                                            

    private  void  jButton1ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        disponer();
    }