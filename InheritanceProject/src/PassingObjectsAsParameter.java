
public class PassingObjectsAsParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl g1 = new Girl("A");
		Girl g2 = new Girl("B");
		
		System.out.println(g1.work(new CaseStudy("Project 1"), g1, g2));
	}
}

class Girl {
	String name;
	
	Girl(String name) {
		this.name = name;
	}
	
	String gossip(Girl g1, Girl g2) {
		return g1.name + " and " + g2.name + " are gossiping.";
	}
	
	Project work(CaseStudy c, Girl x, Girl y) {
		Project proj = new Project(c.caseStudyName);
		return proj;
	}
}

class Project {
	String projectName;

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}
}

class CaseStudy {
	String caseStudyName;

	public CaseStudy(String caseStudyName) {
		super();
		this.caseStudyName = caseStudyName;
	}
}