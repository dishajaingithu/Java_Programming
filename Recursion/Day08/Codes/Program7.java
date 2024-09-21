/*
	Q.Maze Path

	1) input 1 : maze[][] = {
			{0,0,1,0,0}
			{0,0,0,0,0}
			{0,0,0,1,0}
			{1,1,0,1,1}
			{0,0,0,0,0}
	  input 2 : int[] start = {0,4}
	  input 3 : int[] dest = {4,4}

	  output : true.
*/

class MazePath{

	static boolean hasPath(int[][] maze, int[] start, int[] dest){

		if(start[0] == dest[0] && start[1] == dest[1]){
			return true;
		}

		maze[start[0]][start[1]] = 2;

		int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

		for(int[] dir : directions){

			int x = start[0];
			int y = start[1];

			while(x+dir[0]>=0 && x+dir[0]<maze.length && y+dir[1] >=0 && y+dir[1]<maze[0].length && maze[x+dir[0]][y+dir[1]]!=1){

				x += dir[0];
				y += dir[1];
			}

			if(maze[x][y] != 2 && hasPath(maze, new int[] {x,y}, dest))
					return true;

		}
		
		return false;
	}
	public static void main(String[] args){

		int[][] maze = {
			{0,0,1,0,0},
                        {0,0,0,0,0},
                        {0,0,0,1,0},
                        {1,1,0,1,1},
                        {0,0,0,0,0}
		};

		int[] start = {0,4};
		int[] dest = {4,4};

		System.out.println(hasPath(maze,start,dest));
	}
}
