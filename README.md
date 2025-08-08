# Number Guessing Game - Development Process

## 1. Requirement
- [x] Generate random number 1-100
- [x] Accept user input
- [x] Use while loop to compare the input number with the random generated number
- [x] provide feedback (too high/low)
- [x] Count attempts 
- [x] Ask to play again
- [x] Current issue for the input number is bugged. It always showing correct even though the number is wrong and the game is finished as soon as the number is entered. 
- [ ] The program is executing the question every time user guessed number is wrong.

## 2. Planning
- Main game loop structure
- Variable Needed.
- Need to rearrange the print messages.
- Move the question message outside of the if else statement. 

## 3. Implementation
- Code snippet or notes about challenges.
- Fixed the bug for infinite loop happening when the answer is correct.
- Fixed the loop for the correct number was guessed every time user entered an input.
- Put the question statement inside the do while loop instead of if else statement

## 4. Testing
- [x] there is bug in while loop, it doesn't end when user correctly guessed the number
- [x] the guessing game is working properly however additional features can be implemented.