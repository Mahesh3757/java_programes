import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ElementCheckProgram {
    public static void main(String[] args) {
        // Example usage
        Set<String> existingSet = new HashSet<>();
        existingSet.add("apple");
        existingSet.add("banana");
        existingSet.add("orange");

        Collection<String> collectionToCheck = Set.of("apple", "banana");

        boolean result = areAllElementsPresent(existingSet, collectionToCheck);

        if (result) {
            System.out.println("All elements are present in the existing set.");
        } else {
            System.out.println("Not all elements are present in the existing set.");
        }
    }

    // Method to check if all elements of the collection are present in the set
    private static <T> boolean areAllElementsPresent(Set<T> set, Collection<T> collection) {
        // Create a copy of the set to avoid modifying the original set
        Set<T> copyOfSet = new HashSet<>(set);

        // Check if all elements of the collection are present in the set
        for (T element : collection) {
            if (!copyOfSet.contains(element)) {
                return false;
            }
        }

        // If loop completes, all elements are present
        return true;
    }
}
