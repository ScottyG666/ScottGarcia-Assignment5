package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private static final Integer DEFAULT_ARRAY_CAPACITY = 10;
	private static final Integer DOUBLE_CAPACITY = 2;
	private static Integer currentCapactiy;
	private static Integer indexForNextArrayAddition;
	public Object[] items = new Object[DEFAULT_ARRAY_CAPACITY];

	// This Constructor method makes it possible to instantiate multiple sets of our
	// CustomArrayList inside the same application without breaking the backing
	// array;
	public CustomArrayList() {
		indexForNextArrayAddition = 0;
		currentCapactiy = DEFAULT_ARRAY_CAPACITY;
	}

	@Override
	public boolean add(T item) {

		if (indexForNextArrayAddition == currentCapactiy) {
			growCurrentArray();
			items[indexForNextArrayAddition] = item;
			indexForNextArrayAddition += 1;
			return true;
		} else if (indexForNextArrayAddition < currentCapactiy) {
			items[indexForNextArrayAddition] = item;
			indexForNextArrayAddition += 1;
			return true;
		} else {
			return false;
		}
	}

	private void growCurrentArray() {
		Integer count1 = 0;
		
		Integer count2 = 0;
		
		Object[] placeHolder = new Object[currentCapactiy];
		
		for (Object element : this.items) {
			placeHolder[count1] = element;
			count1+=1;
		}
		currentCapactiy *= DOUBLE_CAPACITY;
		this.items = new Object[currentCapactiy];
		
		for (Object element : placeHolder) {
			this.items[count2] = element;
			count2+=1;
		}
		
//
//		Object[] placeHolderArray = new Object[currentCapactiy];
//		for (int i = 0; i < this.items.length - 1; i++) {
//			placeHolderArray[i] = this.items[i];
//		}
//
//		currentCapactiy *= DOUBLE_CAPACITY;
//		items = new Object[currentCapactiy];
//		for (int i = 0; i < placeHolderArray.length - 1; i++) {
//			items[i] = placeHolderArray[i];
//		}

	}

	@Override
	public int getSize() {
		// this number also works for the size of the array, as the first element of the array is
		// indexed 0, not 1
		return indexForNextArrayAddition;
	}

	@Override
	public T get(int index) {

		return (T) this.items[index];
	}

}
