#RobotShop
*By: Infinite Monkeys Studio*  
Start from a simple machine shop and build a buzzing mechanized mass-assembly plant.

###Game Play:
---
You are the owner of a shop that designs, manufactures and sells robots.  You start with nothing, but your hands and a shop. Then through randomly generated contracts you earn money and supplies. To fill the contracts you must design and construct robots. Contracts will slowly get more demanding with higher quantities and tighter deadlines. You will need to hire some employees. Humans are imperfect and inefficient. When you become wealthy enough you will be able to build robots to help you in the shop. Once you construct a robot with AI you will have to write your own AI.

###Nuts & Bolts:
---
We are working in Java with the render and control libraries from processing. We will phase out any involvement with processing before releasing.  
We like to encourage modding. To that end we have provided [Javadocs](http://InfiniteMonkeysStudio.bitbucket.org)

###Instructions for compiling:
---
1. Clone the repo
1. Download [processing](https://www.processing.org/download/)(or not if you already have it)
1. Open the repo in eclipse
1. Link the core.jar (found at \Processing\core\library\core.jar)
1. Run the project as an applet

###Plan for release:
---
Our plan is to release a free alpha as soon as we can.

###Game Play Notes:
---
***These will not be grammatically correct, spelled conventionally, or coherent in any way***  
You will start the game with only one human worker (Meant to be you.) Then you will get more human workers. All workers will have to be told what to do every step of the way.
After a while you will be able to make robots but they will still be need to be told what to do every step. When you discover/earn/invent AI then you will have to write the instructions and the robots will repeat tasks.  They could also work on events.
We will write a language to write this "thinking" it is yet to be decided what the language will look like.  

There will be machines. these are different than the robots. They are stationary they must be fed anything they work with. Also you will not be able to design them. you will have to buy blue prints.

There will be orders that come in like a contract system.  You can accept or decline orders.  but once accepted they must be filled by the deadline.  The factory will have a shipping building that will have truck bays.  As the shipping department is upgraded the trucks will load faster, there will be more bays.  

Supplies are the basic building material of anything. there will be more and more types of scrape as the building projects get more complex.   
Examples of supplies: 
*  Scrap (will be the cheapest, can be refined into some of the other supplies)
*  Sheet metal (basic construction of everything)
*  Refined plastics (More expensive building material)
*  Circuit boards (Used in things that think)
*  Other rare parts

###Developer ToDo:
---
* [ ] Get basic controls working.
* [ ] Put in place holder art.
* [ ] Design draft of tech tree.
* [ ] Outline campaign flow.
* [ ] Create indev version of game.

