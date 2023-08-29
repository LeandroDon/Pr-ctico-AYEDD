import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DenunciaSiniestro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" +
            "\n*                                                                                   *" +
            "\n*                       Bienvenido al portal de denuncias de                        *" +
            "\n*                                LA ÚNICA SEGUROS                                   *" +
            "\n*                                                                                   *" +
            "\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

        List<Asegurado> listAsegurado = new ArrayList<Asegurado>();
        listAsegurado.add(new Asegurado("Juan", "Pérez", 10000000, "Ford", "Ranger", 2020, "AA000AA")); 
        listAsegurado.add(new Asegurado("Roberto", "Sánchez", 11111111, "Fiat", "Palio", 2017 , "AA001AA"));
        listAsegurado.add(new Asegurado("María", "González", 20000000, "Peugeot", "208", 2022, "AA002AA"));
        listAsegurado.add(new Asegurado("Sergio", "Fernández", 22222222,"Toyota", "Corolla", 2021, "AA003AA"));
        listAsegurado.add(new Asegurado("Claudia", "Rodríguez", 33333333, "Renault", "Kangoo", 2019, "AA004AA"));

        String tecla = null;
                  
        do {
        // Información del denunciante
        System.out.println("\nIngrese información del denunciante:\n");
        int i=0;
        String nombre;
        do {
            System.out.print("Nombre: ");
        nombre = scanner.nextLine(); i++;
        if (nombre.isEmpty() && (i==5)) {
            System.out.print("No ha ingresado el dato solicitado. Vuelva a ingresar al sistema.");
            System.exit(0);
        }
        } while (nombre.isEmpty());
        i = 0;
        String apellido;
        do {
            System.out.print("Apellido: ");
        apellido = scanner.nextLine(); i++;
        if (apellido.isEmpty() && (i==5)) {
            System.out.print("No ha ingresado el dato solicitado. Vuelva a ingresar al sistema.");
            System.exit(0);
        }
        } while (apellido.isEmpty());
        i = 0;
        String documento;
        do {
            System.out.print("Número de documento: ");
        documento = scanner.nextLine(); i++;
        if (documento.isEmpty() || documento.length() != 8 || !documento.matches("\\d+")) {
            System.out.print("El número de documento no cumple los requisitos\n");
            if (i==5) {
            System.out.print("\nNo ha ingresado el dato solicitado. Vuelva a ingresar al sistema.");
            System.exit(0);
        }
        }
        } while (documento.isEmpty() || documento.length() != 8 || !documento.matches("\\d+"));
        i = 0;
        String telefono;
        do {
            System.out.print("Teléfono de contacto (sin el 0 y sin el 15): ");
        telefono = scanner.nextLine(); i++;
        if (telefono.isEmpty() || telefono.length() != 10 || !telefono.matches("\\d+")) {
            System.out.print("El número de teléfono no cumple los requisitos\n");
            if (i==5) {
            System.out.print("\nNo ha ingresado el dato solicitado. Vuelva a ingresar al sistema.");
            System.exit(0);
        }
        }
        } while (telefono.isEmpty() || telefono.length() != 10 || !telefono.matches("\\d+"));
        i = 0;
        String correo;
        do {
            System.out.print("Correo electrónico: ");
        correo = scanner.nextLine(); i++;
        if (correo.isEmpty() || !correo.contains("@") || !correo.contains(".")) {
            System.out.println("\nEl formato del correo ingresado no es válido\n");
            if (i==5) {
            System.out.print("\nNo ha ingresado el dato solicitado. Vuelva a ingresar al sistema.");
            System.exit(0);
        }
        }
        } while (correo.isEmpty() || !correo.contains("@") || !correo.contains("."));

        // Información del vehículo asegurado involucrado
        String patenteIngresada;
        boolean patenteEncontrada;
        i=0;
        do {
        System.out.print("\nIngrese la patente del vehículo involucrado: ");
        patenteIngresada = scanner.nextLine();
        patenteEncontrada = false;
        for (Asegurado asegurado : listAsegurado) {
        if (asegurado.getPatente().equalsIgnoreCase(patenteIngresada)) {
        System.out.println("\n" + asegurado);
        patenteEncontrada = true;
        break;
            }
        }
        if (!patenteEncontrada) {
        System.out.println("La patente ingresada no corresponde a un vehículo asegurado."); i++;
            if (i==5) {
            System.out.print("\nBuenas tardes.");
            System.exit(0);
        }
        }
        } while (!patenteEncontrada);
                
        // Información del siniestro
        System.out.println("\nIngrese información del siniestro:\n");
        i=0;
        String fecha;
        do {
            System.out.print("Fecha del accidente (dd/mm/aaaa): ");
            fecha = scanner.nextLine(); i++;
            if (fecha.isEmpty() || !fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("El formato de la fecha ingresada no es válido.\n");
            if (i==5) {
            System.out.print("No ha ingresado el dato solicitado. Vuelva a ingresar al sistema.\n");
            System.exit(0);
        }
        }
        } while (fecha.isEmpty() || !fecha.matches("\\d{2}/\\d{2}/\\d{4}"));
        i=0;
        String hora;
        do {
            System.out.print("Hora del accidente (HH.mm): ");
            hora = scanner.nextLine(); i++;
            if (hora.isEmpty() || !hora.matches("\\d{2}.\\d{2}")) {
            System.out.println("El formato de la hora ingresada no es válido.\n");
            if (i==5) {
            System.out.print("No ha ingresado el dato solicitado. Vuelva a ingresar al sistema.\n");
            System.exit(0);
            }
        }
        } while (hora.isEmpty() || !hora.matches("\\d{2}.\\d{2}"));
        i=0;
        String lugar;
        do {
            System.out.print("Lugar del accidente: ");
            lugar = scanner.nextLine(); i++;
            if (lugar.isEmpty() && i==5) {
            System.out.print("No ha ingresado el dato solicitado. Vuelva a ingresar al sistema.\n");
            System.exit(0);
            }
        } while (lugar.isEmpty());
        System.out.print("Descripción del siniestro: ");
        String descripcion = scanner.nextLine();

        System.out.print("\nHa ingresado la siguiente información: \n" + "\nNombre y apellido: " + nombre + " " + apellido + "\nDNI: " + documento +
        "\nTeléfono: " + telefono + "\nCorreo electrónico: " + correo + "\nPatente del vehículo involucrado: " + patenteIngresada +
        "\nFecha del accidente: " + fecha + "\nHora del accidente: " + hora + "\nLugar del accidente: " + lugar +
        "\nDescripción del siniestro: " + descripcion + "\n\nPor favor, revise la información ingresada.\n");

        do {
            System.out.print("\n¿Confirma la información ingresada (S/N): ");
            tecla = scanner.nextLine();
        } while (!tecla.equalsIgnoreCase("S") && !tecla.equalsIgnoreCase("N"));
        

        } while (tecla.equalsIgnoreCase("N"));
        
        String tecla2 = null;

        do {
        // Información del tipo de daño
        try {
        System.out.println("\nIngrese información del tipo de daño:");
        System.out.println("1. Vehículo");
        System.out.println("2. Daños materiales");
        System.out.println("3. Lesiones");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción (1-4): ");
        int tipoDaño = scanner.nextInt();


        switch (tipoDaño) {
            case 1:
                System.out.println("\nDocumentación para siniestros de autos o motos:\n");
                String tieneCobertura;

                do {
                    System.out.print("¿Posee cobertura de seguro? (S/N): ");
                    tieneCobertura = scanner.next();
                } while (!tieneCobertura.equalsIgnoreCase("S") && !tieneCobertura.equalsIgnoreCase("N"));
                
                if (tieneCobertura.equalsIgnoreCase("S")) {
                    System.out.println("\n- Denuncia interna");
                    System.out.println("- Certificado de cobertura");
                }
                
                String tieneFranquicia;
                do {
                    System.out.print("\n¿Posee franquicia? (S/N): ");
                    tieneFranquicia = scanner.next();
                } while (!tieneFranquicia.equalsIgnoreCase("S") && !tieneFranquicia.equalsIgnoreCase("N"));
                
                if (tieneFranquicia.equalsIgnoreCase("S")) {
                    System.out.println("\n- Nota de franquicia emitida por su aseguradora");
                }

                System.out.println("- Licencia de conducir");
                System.out.println("- Tarjeta verde (en caso de no poseer, boleto de compra-venta de la unidad)");
                System.out.println("- Fotos del vehículo");
                System.out.println("- Presupuestos de reparación (mano de obra y repuestos)");
                System.out.println("\nPor favor, escanee y cargue la documentación indicada precedentemente.");
                break;

            case 2:
                System.out.println("\nDocumentación para siniestros de daños materiales:");
                
                System.out.println("\n¿El daño fue a bienes...: ");
                System.out.println("I. Inmuebles");
                System.out.println("M. Muebles");
                System.out.print("Seleccione una opción (I-M): ");
                String tipoDañoMaterial = scanner.next().toUpperCase();
                
                switch (tipoDañoMaterial) {
                
                    case "I":
                    do {
                    System.out.print("\n¿Posee cobertura de seguro? (S/N): ");
                    tieneCobertura = scanner.next();
                    } while (!tieneCobertura.equalsIgnoreCase("S") && !tieneCobertura.equalsIgnoreCase("N"));

                    if (tieneCobertura.equalsIgnoreCase("S")) {
                        System.out.println("- Denuncia interna");
                        System.out.println("- Certificado de cobertura");
                    }
                    System.out.println("- Impuesto donde se describa el domicilio del bien dañado y el nombre de su propietario");
                    System.out.println("- DNI del propietario del bien dañado");
                    System.out.println("- Fotos");
                    System.out.println("- Presupuestos de reparación");
                    System.out.println("\nPor favor, escanee y cargue la documentación indicada precedentemente.");
                    break;
                
                    case "M":
                    do {
                    System.out.print("\n¿Posee cobertura de seguro? (S/N): ");
                    tieneCobertura = scanner.next();
                    } while (!tieneCobertura.equalsIgnoreCase("S") && !tieneCobertura.equalsIgnoreCase("N"));

                    if (tieneCobertura.equalsIgnoreCase("S")) {
                        System.out.println("- Denuncia interna");
                        System.out.println("- Certificado de cobertura");
                    }
                    if (tieneCobertura.equalsIgnoreCase("N")) {
                    System.out.println("- Nota donde se describe el incidente");
                    }
                    System.out.println("- Factura/título donde se describa el bien dañado y el nombre de su propietario");
                    System.out.println("- DNI del propietario del bien dañado");
                    System.out.println("- Fotos");
                    System.out.println("- Presupuestos de reparación");
                    System.out.println("\nPor favor, escanee y cargue la documentación indicada precedentemente.");
                    break;

                    default:
                    System.out.println("Opción inválida.");
                    break;
                }
                break;

            case 3:
                System.out.println("\nDocumentación para siniestros de lesiones: \n");
                do{
                System.out.print("¿Posee cobertura de seguro? (S/N): ");
                tieneCobertura = scanner.next();
                } while (!tieneCobertura.equalsIgnoreCase("S") && !tieneCobertura.equalsIgnoreCase("N"));

                if (tieneCobertura.equalsIgnoreCase("S")) {
                    System.out.println("- Denuncia interna");
                    System.out.println("- Certificado de cobertura");
                }

                System.out.println("- DNI del lesionado");
                System.out.println("- Informe / certificado de centro de salud que realizó la atención");
                System.out.println("Por favor, escanee y cargue la documentación indicada precedentemente.");
                break;
            
            case 4:
                System.out.println("\nBuenas tardes.\n");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        } catch (InputMismatchException ex) {
            System.out.print("\nPor favor, ingrese una opción válida\n");
        }       
        do {
            System.out.print("\n¿Desea regresar al menú de daños? (S/N): ");
            tecla2 = scanner.next();
        } while (!tecla2.equalsIgnoreCase("S") && !tecla2.equalsIgnoreCase("N"));
        } while (tecla2.equalsIgnoreCase("S"));
    System.out.println("\nSu denuncia ha sido registrada y será procesada a la brevedad.\n"
     + "Muchas gracias por utilizar el portal de denuncias de LA ÚNICA SEGUROS.\n");
    scanner.close();
}
}