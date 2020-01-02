from tkinter import *

master = Tk()
self = Canvas(master, width  = 500, height = 500, background = 'green')
self.pack()

#Function for moving eyes when button is pressed
def moveEyes():
        self.delete('all')
        self.create_oval(10, 10, 490, 490)
        self.create_oval(280, 50, 380, 150)
        self.create_oval(120, 100, 220, 200)
        self.create_line(140, 350, 360, 350)
        
#Function for moving mouth when button is pressed
def moveMouth():
    left = self.create_line(140,350, 160, 370)
    right = self.create_line(360, 350, 340, 370)
    bottom = self.create_line(160,370, 340, 370)

#Function for Drawing the beginning display
def drawDisplay():
    self.create_oval(10, 10, 490, 490)

    leftEye = self.create_oval(120, 100, 220, 200)
    rightEye = self.create_oval(280, 100, 380, 200)
    closedmouth = self.create_line(140, 350, 360, 350)

    
    exitButton = Button(master, text='exit', command = quit)
    exitButton.pack()

    eyesButton = Button(master, text = 'eyes', command = moveEyes)
    eyesButton.pack()

    mouthButton = Button(master, text = 'mouth', command = moveMouth)
    mouthButton.pack()
    

drawDisplay()


mainloop()

  
 


    





                
    
    

