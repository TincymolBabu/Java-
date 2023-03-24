class Product
{
String pcode;
String pname;
int price;
Product(String pcode_get,String pname_get,int price_get)
{
pcode=pcode_get;
pname=pname_get;
price=price_get;
}
public static void main(String args[])
{
Product p1=new Product("A","TV",10000);
Product p2=new Product("B","mobile",8000);
Product p3=new Product("C","Clock",5000);
if(p1.price<p3.price && p1.price<p2.price)
System.out.println("lowest price product is"+p1.pname);
if(p2.price<p1.price && p2.price<p3.price)
System.out.println("lowest price product is"+p2.pname);
if(p3.price<p2.price && p3.price<p1.price)
System.out.println("lowest price product is"+p3.pname);
}
}
