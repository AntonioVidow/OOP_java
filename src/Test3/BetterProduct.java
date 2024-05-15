package Test3;

public class BetterProduct extends Product{
    public BetterProduct(int id, String name, int quantity) {
        super(id, name, quantity);
    }
    @Override
    public int buy(Product product, int quantity){
        if(product.getQuantity()>quantity){
            int result = product.getQuantity()-quantity;
            product.setQuantity(result);
            return product.getId();
        }else{
            throw new RuntimeException("There is not enough quantity!");
        }
    }
}
