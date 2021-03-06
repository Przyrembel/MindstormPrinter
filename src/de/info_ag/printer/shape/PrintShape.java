package de.info_ag.printer.shape;

import java.util.LinkedList;

public class PrintShape {
		LinkedList<ShapePart> parts;
		
		private Point startPoint;

		public PrintShape(){
			this(0, 0);		
		}
		
		public PrintShape(int startX, int startY) {
			this(new Point(startX, startY));			
		}		

		public PrintShape(Point startPoint) {
			parts = new LinkedList<ShapePart>();
			this.startPoint = startPoint;
		}
		
		public void attachShapePart(int xParameter, int yParameter, boolean isPrinted) {
			parts.add(new ShapePart(xParameter, yParameter, isPrinted));
		}
		
		
		 
		public void attachPrintShape(PrintShape newShape){
			//TODO
			//parts.attachShapePart(newShape.startPoint.getXCoordinate(), newShape.startPoint.getYCoordinate(), false);
			parts.addAll(newShape.parts);
		}
		
		
		public void scale(int scale){
			//TODO
		}
		
		public Point getStartPoint(){
			return startPoint;
		}
	}
