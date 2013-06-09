import java.util.HashSet;
import java.util.Set;


class LowestCommanAncestor {

	int nodes[] = {0,0,2,2};
	//int nodes[] = {0,0,1,1,1,2,3,4,4};
	
	public static void main(String[] args) {
		
		LowestCommanAncestor lowestCommanAncestor = new LowestCommanAncestor();
		
		
		Set<Integer> common = new HashSet<Integer>();
		common.add(2);
		common.add(4);
		//common.add(9);
		
		Set set = lowestCommanAncestor.getParents(common);
		
		
		
		System.out.println("zzz : " + set);

	}
	
	public Set getParents(Set common) {
		Set<Integer> set = new HashSet<Integer>();
		System.out.println("common : " + common);
		for(Object obj: common) {
			Integer node = (Integer) obj;
			Integer viz = nodes[node-1];
			//System.out.println("viz : " + node  + " :: "+ viz);
			set.add(viz);
		}
		System.out.println("set : " + set);
		if(set.size() == 1) {
			System.out.println("final set : " + set);
		} else {
			set = this.getParents(set);
		}

		return set;
	}

}
