package ch10_extends_interface.starcraft;

public class Marine extends StarUnit{
	
	public Marine() {
		this("마린", 6, 50, 0);
	}
	
	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
//		super.setName(name); // 이런식으로도 방식 가능
	}
	
	
	
	public void stimpack() {
		System.out.println("우아아아아!");
		
		super.setHp(super.getHp() - 10);
		super.setDamage(super.getDamage() * 2);
	}
	

	@Override
	public String toString() {
		return "Marine [name=" + super.getName()+ ", damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + "]";
	}

	
	
	
	
	
	
	
}
