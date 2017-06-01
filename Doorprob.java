public class DoorProblem { 
public static void main(String arg[]) { 
/** 
* Starting position of doors are closed 
* Logic behind this problem is simple 
* if we visit each door odd times it will remain open 
* else it will be closed(means even times) 
* Find the number factor of each number . 
* check whether factor is odd or even 
*/ 

// 1 means open 0 means close 
int door[] = new int[101]; 
//Factor calculation 
for (int j = 1; j < door.length; j++) { 
int count = 0; 
for (int i = 1; i <= j; i++) { 
if (j % i == 0) { 
count++; 
} 
} 
//Factor is odd of even 
if (count % 2 == 1) { 
door[j] = 1; 
} else 
door[j] = 0; 
} 
for (int i = 1; i < door.length; i++) { 
if(door[i]== 1){ 
System.out.println("Door "+ i +" is open"); 
} 
else 
System.out.println("Door "+ i +" is close"); 
} 
} 

}
