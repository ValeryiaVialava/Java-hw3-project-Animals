#### **TASK**

![[кэш Java project Animals.png|500]]

the Animal Class should include:
- Field: `weight`
- Field: `age`
- Field: `name`
- Method: `eat`
- Method: `sleep`
- Method: `whoAmI`

the Mammal Class:
- Field: `numberOfLegs`
- Method: `walk`

the Bird Class:
- Method: `fly`

the Fish Class:
- Method: `swim`

the Carnivorous Interface:
- Method: `hunt`

additional requirements:
- Additional fields, methods, or constructors can be added if necessary.

method descriptions:
- **`whoAmI` method**: Should display the name, age, weight, and species of the animal.
- **`walk` method**: Should display information about how many legs the animal is walking on.
- **Other methods**: Should print a message to the screen that they have been invoked, e.g., *"I’m sleeping"*.

testing:
- The methods should be tested by creating instances of all animals one by one.

----


```
-----WITH POLYMORPHISM-----------------

name: Dumbo age: 10 weight: 5000.0 species: mammal
I'm eating...
I'm sleeping...
Dumbo walks on 4 legs
----------------------
name: Shera age: 5 weight: 300.0 species: mammal
I'm eating...
I'm sleeping...
Shera walks on 4 legs
Shera is hunting
----------------------
name: Chirpy age: 1 weight: 0.02 species: bird
I'm eating...
I'm sleeping...
I'm flying
----------------------
name: Hooty age: 3 weight: 1.5 species: bird
I'm eating...
I'm sleeping...
I'm flying
Hooty is hunting
----------------------
name: Goldie age: 2 weight: 0.5 species: fish
I'm eating...
I'm sleeping...
I'm swimming
----------------------
name: Jaws age: 7 weight: 800.0 species: fish
I'm eating...
I'm sleeping...
I'm swimming
Jaws is hunting
----------------------

-----WITHOUT POLYMORPHISM-----------------

name: Dumbo age: 10 weight: 5000.0 species: mammal
Dumbo walks on 4 legs
I'm eating...
I'm sleeping...
----------------------
name: Shera age: 5 weight: 300.0 species: mammal
Shera walks on 4 legs
I'm eating...
I'm sleeping...
Shera is hunting
----------------------
name: Chirpy age: 1 weight: 0.02 species: bird
I'm flying
I'm eating...
I'm sleeping...
----------------------
name: Hooty age: 3 weight: 1.5 species: bird
I'm flying
I'm eating...
I'm sleeping...
Hooty is hunting
----------------------
name: Goldie age: 2 weight: 0.5 species: fish
I'm swimming
I'm eating...
I'm sleeping...
----------------------
name: Jaws age: 7 weight: 800.0 species: fish
I'm swimming
I'm eating...
I'm sleeping...
Jaws is hunting

```
