# Game : T-Rex

## Demo 

[<img src="https://github.com/laxmikantbpandhare/TRex-sp19-202-algorithmic-traders/blob/master/docs/trex.gif" height="550" width="1000">](https://www.youtube.com/watch?v=XFNGYsLeGJA)

## Introduction

Dinosaur, T-Rex is out in the wild and running around. He got some life intially which might get drained out when he hits some obstacles. He can also gain rewards and food by catching them. User can track his score and life based on the obstacles crossed and rewards collected. There are two levels in the game which user can cross based on the score. User wins the game at score of 200 and has the option to replay the game.

## Members 
   | Name                           | SJSU ID    |
   |--------------------------------|------------|
   | **Laxmikant Bhaskar Pandhare** | 013859989  |
   | **Prachi Chouksey**            | 013828945  |
   | **Pallavi Reddy**              | 013852800  |
   | **Wamiquw Ansari**             | 013764595  |
   | **Suyash Srivastava**          | 013591474  |
   
   
## About T-Rex's Story:  https://www.youtube.com/watch?v=AU99mCW95cg



## Burndown Chart

https://drive.google.com/file/d/1Qa-W-6w4d4a4CYtXIrRqybHqqfZFgUG0/view?usp=sharing

![alt text](https://github.com/laxmikantbpandhare/TRex-sp19-202-algorithmic-traders/blob/master/docs/Burndown%20Chart.png)

## UI Mock screen

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/mockui/TRex_Home.jpeg)





# Patterns and Diagrams for project

## Patterns implemented

#### Composite Pattern
The land obstacles, sky obstacles and rewards are added in the game using composite pattern.

#### Prototype pattern
To clone the numerous obstacles and rewards in the world, prototype pattern is used.

#### Strategy pattern
Placement of objects at different levels is handled through strategy pattern.

#### Mediator pattern
To avoid tight coupling between various classes in the game, mediator is used.

#### Observer pattern
Scoreboard and lives of the user are updated using observer pattern.

#### Command pattern
To start/quit the game, this pattern is used to send commands to the game.

## UML Diagrams
![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram_T-Rex.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Activity%20Diagram.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/UseCase%20Diagram.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram%20-%20composite.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram%20T%20Rex%20COmmand%20Pattern.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram%20-%20Mediator%20Pattern.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/ClassDiagram-ObserverPattern_Scoreboard_Lifebar.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Strategy_Class_Diagram.png)
