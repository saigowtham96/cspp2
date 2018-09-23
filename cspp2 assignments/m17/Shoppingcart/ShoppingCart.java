/**
 * Class named "shoppingcart".
 */
class ShoppingCart {
    Item[] catalogArray;
    Item[] cartArray;
    int sizeCatalog;
    int sizeCart;
    String[] validCoupons = {"IND10", "IND20", "IND30", "IND50"};
    static double discount = 0.0;
    static private boolean couponApplied = false;
    ShoppingCart() {
        catalogArray = new Item[20];
        cartArray = new Item[20];
        sizeCatalog = 0;
        sizeCart = 0;
    }
    public void addToCatalog(Item item) {
        catalogArray[sizeCatalog++] = item;
    }
    public boolean inCart(Item item) {
        for (Item s : cartArray) {
            if (s != null) {
                if (s.nameOfItem.equals(item.nameOfItem)) {
                    s.quantityOfItem += item.quantityOfItem;
                    return true;
                }
            }
        }
        return false;
    }
    public void addToCart(Item item) {
        if (!inCart(item)) {
            if (checkCatalog(item)) {
                cartArray[sizeCart++] = item;
            }
        }
    }
    private boolean checkCatalog(Item item) {
        for (Item i : catalogArray) {
            if (i != null) {
                if (i.nameOfItem.equals(item.nameOfItem)) {
                    if (item.quantityOfItem <= item.quantityOfItem) {
                        i.quantityOfItem -= item.quantityOfItem;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public void removeFromCart(Item item) {
        for (int i = 0; i < sizeCart; i++) {
            if (cartArray[i].nameOfItem.equals(item.nameOfItem)) {
                cartArray[i].quantityOfItem -= item.quantityOfItem;
            }
        }
    }
    public void showCatalog() {
        for (int i = 0; i < sizeCatalog; i++) {
            System.out.println(catalogArray[i]);
        }
    }
    /**
     * Shows the cart items.
     */
    public void showCart() {
        for (int i = 0; i < sizeCart; i++) {
            if (cartArray[i].quantityOfItem != 0) {
                System.out.println(cartArray[i].nameOfItem + " " + cartArray[i].quantityOfItem);
            }
        }
    }
    /**
     * Gets the total amount.
     * @return     The total amount.
     */
    public double getTotalAmount() {
        double totalAmount = 0;
        for (int i = 0; i < sizeCart; i++) {
            totalAmount  = totalAmount + cartArray[i].quantityOfItem * getPrice(cartArray[i]);
        }
        return totalAmount;
    }
    /**
     * Gets the price.
     * @param      givenAmount  The given amount
     * @return     The price.
     */
    double getPrice(final Item givenAmount) {
        for (Item i : catalogArray) {
            if (i != null) {
                if (i.nameOfItem.equals(givenAmount.nameOfItem)) {
                    return i.unitprice;
                }
            }
        }
        return 0.0;
    }
    /**
     * variable for 100.
     */
    final int hundred = 100;
    /**
     * variable for 15.
     */
    final int fifteen = 15;
    /**
     * applies a valid coupon.
     * @param      coupon  The coupon
     */
    void applyCoupon( final String coupon) {
        if (couponApplied) {
            return;
        }
        boolean variable = false;
        for (String s : validCoupons) {
            if (s.equals(coupon)) {
                int number = Integer.parseInt(coupon.substring(3));
                discount = getTotalAmount() * number / hundred;
                couponApplied = true;
                variable = true;
            }
        }
        if (!variable) {
            System.out.println("Invalid coupon");
            return;
        }
    }
    /**
     * prints the invoice of the user.
     */
    public void printInvoice() {
        for (Item i : cartArray) {
            if (i != null) {
                if (i.quantityOfItem != 0) {
                    System.out.println(i.nameOfItem + " " + i.quantityOfItem + " " +  getPrice(i));
                }
            }
        }
        double amount;
        double amountAfterDiscount = getTotalAmount() - discount;
        double tax = (amountAfterDiscount * fifteen) / hundred;
        System.out.println("Total:" + getTotalAmount());
        System.out.println("Disc%:" + discount);
        System.out.println("Tax:" + tax);
        System.out.println("Payable amount: " + getPayableAmount());
    }
    /**
     * Gets the payable amount.
     * @return     The payable amount.
     */
    public double getPayableAmount() {
        double payableAmount;
        double amountAfterDiscount = getTotalAmount() - discount;
        double tax = (amountAfterDiscount * fifteen) / hundred;
        payableAmount = amountAfterDiscount + tax;
        return payableAmount;
    }
}