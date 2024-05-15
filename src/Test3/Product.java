package Test3;

public class Product implements Buyable{
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        setId(id);
        setQuantity(quantity);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }else{
            System.out.println("Id is not correct");
        }
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0){
            this.quantity = quantity;
        }else{
            System.out.println("Quantity is not correct");
        }
    }

    @Override
    public int buy(Product product, int quantity) {
        if(product.getQuantity()>quantity){
            int result = product.getQuantity()-quantity;
            product.setQuantity(result);
            return product.getId();
        }else{
            return -1;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
