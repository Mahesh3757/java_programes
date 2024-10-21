// PackageExample.java (Main class in the same package)
package mypackage;

// Class in the same package
class SamePackageClass {
    // Member variable
    int samePackageVar = 10;

    void samePackageMethod() {
        System.out.println("Same package method");
    }
}

// External class in a different package
class ExternalPackageClass {
    public int externalVar = 20;

    public void externalMethod() {
        System.out.println("External package method");
    }
}

public class packageExample {
    public static void main(String[] args) {
        // Creating an object of SamePackageClass
        SamePackageClass samePackageObj = new SamePackageClass();

        // Accessing members of the class in the same package
        System.out.println("Same Package Variable: " + samePackageObj.samePackageVar);
        samePackageObj.samePackageMethod();

        // Creating an object of ExternalPackageClass
        ExternalPackageClass externalPackageObj = new ExternalPackageClass();

        // Accessing members of the external class
        System.out.println("External Package Variable: " + externalPackageObj.externalVar);
        externalPackageObj.externalMethod();
    }
}
