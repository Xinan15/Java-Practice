class Person {

    private String name; 
    // private = restricted access

    // trying to access 'private name'
    Person myObj = new Person();
        myObj.name = "John";  // error
        
        System.out.println(myObj.name); // error 
    
    // So, we need provide public get and set methods to access and update the value of a private variable
    // Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

    // Getter: the get method returns the variable value
    public String getName() {
        return name;
    }

    // Setter: the set method sets the value.
    // 'this' keyword is used to refer to the current object.
    public void setName(String newName) {
        this.name = newName;
    }
}
