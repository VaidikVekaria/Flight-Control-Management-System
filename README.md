# Flight-Control-Management-System

Flight Control Management System is an autopilot reading from various flight sensors and performing navigation. 

It is Java project that involves the use of design patterns such as Factory, Proxy, Facade, Observer, State, Singleton and Command. 

# Project Description
An aircraft which has three GPS receivers obtaining at real time the position of the aircraft in terms of latitude and longitude values. The autopilot software of the aircraft sends requests to obtain the coordinates from the three GPS receivers. There are two brands of GPS receivers (two Honeywell and one Rockwell). The current system employs a 2-3 voting strategy to determine the coordinate to use (i.e. if two of the GPS readings are within a tolerance limit, then any of the two readings is used, and when all three readings differ at a higher than the tolerance value then an error message is generated and the reading of the fist GPS is used).  Once the current coordinates are obtained the appropriate modules to control surfaces of the airplane are notified so that the airplane can be steered to the right direction to reach the next waypoint which is stored in the autopilot. 
Assumptions: 
1.	Consider the longitude and latitude values to be numbers from 0-2
2.	Consider that the messages to modules that move the control surfaces (i.e. the rudder, the ailerons, the elevator) steer the aircraft in a proper way


This project involves the design of a system as a collection of classes using design patterns such as Factory, Proxy, Facade, Observer, State, Singleton and Command.

Process:
1.	The Autopilot object sends a message (do this on a loop 100 times) to Proxy component (see Proxy pattern). 
2.	The Proxy object calls the Navigation Façade
3.	The Navigation Façade does the following sequence of steps (see Façade pattern)
3.a Send a request to GPSReceiver1 object to get the first reading
3.b Send a request to GPSReceiver2 object to get the second reading
3.c Send a request to GPSReceiver3 object to get the third reading
3.d Apply the current comparison strategy (2-3 voting, or first reading is always correct) to get   
       the resulting coordinates 
3.e Update the Autopilot with the new coordinates 
3.f Send the coordinates to the GPS Date Subject
4.	The GPS Data Subject notifies the Actuators 
5.	The Autopilot notifies the control surfaces with the offset of how much left, right, up or down the airplane is off from the desired path \

