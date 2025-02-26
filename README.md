**OOP Design Challenge - E-Commerce System**

This repository contains an implementation of an e-commerce system that demonstrates key object-oriented programming principles as required for SE/CprE 4160 Assignment #1, Problem 4.

**Project Structure**

The project consists of the following classes:

**Inheritance**

Product (Abstract Base Class): Defines common properties and behaviors for all products

Book (Subclass): Inherits from Product, adding book-specific attributes like author and ISBN

Electronics (Subclass): Inherits from Product, adding electronics-specific attributes like manufacturer and warranty

**Interface Implementation**

Discountable (Interface): Defines methods for applying discounts to products

Electronics class implements the Discountable interface, allowing electronic products to receive discounts

**Polymorphism**

Method Overriding: The calculateTax() method is overridden in both Book and Electronics subclasses to provide different tax calculations

Method Overloading: The updatePrice() method in the Product class is overloaded with different parameter lists

**Data Coupling**

The calculateTotal(double shippingCost, boolean applyTax) method in ShoppingCart demonstrates data coupling by passing primitive data types

**Stamp Coupling**

The applyDiscounts(DiscountStrategy strategy) method in ShoppingCart demonstrates stamp coupling by passing a DiscountStrategy object

**Implementation Details**

- Each class and interface is designed to work together in a cohesive e-commerce system:

- Products can be added to a shopping cart

- Different product types have specialized behaviors

- The system supports discounts for eligible products

- Tax calculations vary by product type
