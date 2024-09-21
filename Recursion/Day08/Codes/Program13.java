/*
	Q.Combination Sum.
	
	i/p = candidates = {2,3,6,7} , target = 7
	o/p = [[2,2,3],[7]]	
*/
import java.util.Scanner;
import java.util.List;
class CombinationSum{

	void combinationUntil(int[] candidates, int target, int s1,List<Integer> current, List<List<Integer>> result){

		if(target == 0){
			result.add(new ArrayList(current));
			return;
		}

		for(int i=s1; i<cadidates.length; i++){
			if(candidates[i]<=target){
				current.add(candidates[i]);
			}

			combinationUntil(candidates,target-candidates[i],s1,current,result);

			current.remove(current.size()-1);
		}
	}
	static List<List<Integer>> combinationSum(int[] candidates, int target){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		combinationUntil(candidates,target,0,new ArrayList(), result);
		return result;
	}
	public static void main(String[] args){

		int[] arr = {2,3,6,7}
		int target = 7;

		combinationSum(arr,target);
	}
}
