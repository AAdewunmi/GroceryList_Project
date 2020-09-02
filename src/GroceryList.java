import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private final List<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + ". ") + groceryList.get(i));
        }
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        return position >= 0;
    }
}

