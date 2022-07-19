// In Kotlin, a property don’t require explicit getter or setter methods:

// var author: String = "Frank Herbert"

// This is the same as defining the following get() and set() methods:

var author: String = "Frank Herbert"
    get() {
        return field
    }
    set(value) {
        field = value
    }
// The default getter and setter is a familiar pattern we see in Java, but in Kotlin,
// we don’t have to create a private backing field for the property.