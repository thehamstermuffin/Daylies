//Debe recibir (hora,minuto) y convertirlo en texto
//TODO: decir minutos
class Hora{
 int hora=0;
 int min=0;
 String horatxt="";
 String mintxt="";
 String mod="";

  //Inicializar hora
 public Hora(int h,int m){
  hora=h;
  min=m;
  setHoratxt();
  setMintxt();
  setMod();
 }

 public int getHora(){
  return hora;
 }
 public int getMin(){
  return min;
 }

 public String getHoratxt(){
  return horatxt;
 }
 public String getMintxt(){
  return mintxt;
 }
 public String getMod(){
  return mod;
 }

 public void setHoratxt(){
  switch(hora){
   case 0: horatxt= "twelve";
    break;
   case 1: horatxt= "one";
    break;
   case 2: horatxt= "two";
    break;
   case 3: horatxt= "three";
    break;
   case 4: horatxt= "four";
    break;
   case 5: horatxt= "five";
    break;
   case 6: horatxt= "six";
    break;
   case 7: horatxt= "seven";
    break;
   case 8: horatxt= "eight";
    break;
   case 9: horatxt= "nine";
    break;
   case 10: horatxt= "ten";
    break;
   case 11: horatxt= "eleven";
    break;
   case 12: horatxt= "twelve";
    break;
   case 13: horatxt= "one";
    break;
   case 14: horatxt= "two";
    break;
   case 15: horatxt= "three";
    break;
   case 16: horatxt= "four";
    break;
   case 17: horatxt= "five";
    break;
   case 18: horatxt= "six";
    break;
   case 19: horatxt= "seven";
    break;
   case 20: horatxt= "eight";
    break;
   case 21: horatxt= "nine";
    break;
   case 22: horatxt= "ten";
    break;
   case 23: horatxt= "eleven";
    break;
   default: horatxt="Error en hora";
    break;
  }
 return;
 }
 public void setMintxt(){
  return;
 }

 public void setMod(){
  if(hora < 12) 
    mod="am";
  else 
    mod="pm";
  return;
 }
/* public String convHora(){
 switch (hora){
   case 0: horatxt="midnight";
//   else;
   }
 }
*/ 
}
class Main{
 public static void main(String[] args){
 Hora h=new Hora(13,35);
// h.setHoratxt();
 System.out.println("It's "+ h.getHoratxt()+ " " + h.getMintxt() + " " + h.getMod());
 }
}

