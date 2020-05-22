	 import java.rmi.registry.LocateRegistry;
 import java.rmi.registry.Registry;
 
 public class Calc {
     public static void main(String args[]){
 
         String host = (args.length < 1) ? "localhost" : args[0];
         String port = (args.length < 2) ? "1099" : args[1];
 
         try {
             Registry registry = LocateRegistry.getRegistry(host, Integer.parseInt(port));
 
             Operasi operasi = (Operasi) registry.lookup("operasi");
             Double hasil = 0.0;
             switch(args[2]){
                 case "tambah":
                 hasil = operasi.tambah(Double.parseDouble(args[3]), Double.parseDouble(args[4]));
                     
			break;
                 case "kurang":
                 hasil = operasi.kurang(Double.parseDouble(args[3]), Double.parseDouble(args[4]));
                     
			break;
		 case "kali":
		 hasil = operasi.kali(Double.parseDouble(args[3]), Double.parseDouble(args[4]));

			break;
		 case "bagi":
		 hasil = operasi.bagi(Double.parseDouble(args[3]), Double.parseDouble(args[4]));

			break;
		 case "modulo":
		 hasil = operasi.modulo(Double.parseDouble(args[3]), Double.parseDouble(args[4]));

			break;
		 case "pangkat":
		 hasil = operasi.pangkat(Double.parseDouble(args[3]), Double.parseDouble(args[4]));

			break;
                 default:
                     System.out.println("Operasi tidak dikenali atau parameter tidak lengkap");
                     	
			break;
             }
             System.out.println("Hasil: " + hasil);
         }
		 catch (Exception e) {
             System.out.println("Calc exception: " + e.getMessage());
              e.printStackTrace();
         }
     }
 }
