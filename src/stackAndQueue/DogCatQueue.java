package stackAndQueue;

import java.util.ArrayDeque;

/*
 * Coding Interview Guide 
 * 猫狗队列。
 * 宠物、猫和狗的类已确定。实现一种猫狗队列的结构，满足：
 * add,poll,pollDog,pollCat,isEmpty,isDogEmpty,isCatEmppty等方法
 */
public class DogCatQueue {
	private ArrayDeque<PetEnterQueue> dogQ;
	private ArrayDeque<PetEnterQueue> catQ;
	private long count;
	
	public DogCatQueue() {
		dogQ = new ArrayDeque<PetEnterQueue>();
		catQ = new ArrayDeque<PetEnterQueue>();
		this.count = 0;
	}
	
	public void add(Pet pet) {
		if ( pet.getPetType().equals("dog")) {
			dogQ.add(new PetEnterQueue(pet, this.count++));
		} else if (pet.getPetType().equals("cat")) {
			catQ.add(new PetEnterQueue(pet, this.count++));
		} else {
			throw new RuntimeException("Error! Not dog or cat!");
		}
	}
	
	public Pet poll() {
		if (!dogQ.isEmpty() && !catQ.isEmpty()) {
			if (dogQ.peek().getCount() < catQ.peek().getCount()){
				return dogQ.poll().getPet();
			} else {
				return catQ.poll().getPet();
			}
		} else if (!dogQ.isEmpty()) {
			return dogQ.poll().getPet();
		} else if (!catQ.isEmpty()) {
			return catQ.poll().getPet();
		} else {
			throw new RuntimeException("Error! Not dog or cat!");
		}
	}
	
	public Dog pollDog() {
		if (!dogQ.isEmpty()) {
			return (Dog)dogQ.peek().getPet();
		} else {
			throw new RuntimeException("Error! Not dog!");
		}
	}
	
	public Cat pollCat() {
		if (!catQ.isEmpty()) {
			return (Cat)catQ.peek().getPet();
		} else {
			throw new RuntimeException("Error! Not cat!");
		}
	}
	
	public boolean isEmpty() {
		return catQ.isEmpty() && dogQ.isEmpty();
	}
	
	public boolean isDogEmpty() {
		return dogQ.isEmpty();
	}
	
	public boolean isfCatEmpty() {
		return catQ.isEmpty();
	}
}

	class Pet {
		private String type;
	
		public Pet (String type) {
			this.type = type; 
	}
	
		public String getPetType() {
			return this.type;
		}
	}	

	class Dog extends Pet {
		public Dog () {
			super("dog");
		}
	}
	
	class Cat extends Pet {
		public Cat () {
			super("cat");
		}
	}
	
	class PetEnterQueue {
		private Pet pet;
		private long count; //记录宠物进栈的次序，逐一递增
		public PetEnterQueue(Pet pet, long count){
			this.pet = pet;
			this.count = count;
		}
		public Pet getPet() {
			return this.pet;
		}
		public long getCount () {
			return this.count;
		}
		public String getEnterPetType() {
			return this.getPet().getPetType();
		}
	}
