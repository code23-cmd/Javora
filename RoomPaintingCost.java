class RoomPaintingCost {
 int Length, Width, Height;
 int Window1, Window2, Door;
 int Area, PaintableArea;
 int Labour_Cost, Material_Cost, Final_Cost;

 // Constructor to store room and door/window values
 RoomPaintingCost(int L, int W, int x, int y, int z) {
  Length = L;
  Width = W;
  Window1 = x;
  Window2 = y;
  Door = z;
  Height = 10;  // Taking room height as 10 feet
   }

  void area() {
   // Finding the area of all four walls
    Area = 2 * (Length + Width) * Height;

	System.out.println("\nTotal Wall Area: " + Area);

   // Removing window and door area because we don't paint them
    PaintableArea = Area - Window1 - Window2 - Door;

	System.out.println("Paintable Area: " + PaintableArea);

  // Cost per square feet
	 Labour_Cost = 10 * PaintableArea;
	 Material_Cost = 30 * PaintableArea;
	 Final_Cost = Labour_Cost + Material_Cost;

    }

   void display() {

     System.out.println("One Window: " + Window1);
     System.out.println("Other Window: " + Window2);
     System.out.println("Door: " + Door);
     System.out.println("Height: " + Height);
     System.out.println("Labour Cost: " + Labour_Cost);
     System.out.println("Material Cost: " + Material_Cost);
     System.out.println("Final Cost: " + Final_Cost);
    }

    public static void main(String args[]) {

     // Creating object and passing room details
     RoomPaintingCost c1 = new RoomPaintingCost(10, 15, 5 * 5, 4 * 4, 6 * 4);

        c1.area();
        c1.display();
    }
}