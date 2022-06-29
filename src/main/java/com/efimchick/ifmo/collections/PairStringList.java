package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList implements List<String> {

    private List<String> elementData;

    public PairStringList() {
        this.elementData = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "PairStringList{" +
                "elementData=" + elementData +
                '}';
    }

    public static void main(String[] args) {
        List<String> test = new PairStringList();
        test.add("zz");
        System.out.println(test.toString());
        System.out.println(test.size());
    }
    @Override
    public int size() {
        return elementData.size();
    }

    @Override
    public boolean isEmpty() {
        return elementData.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elementData.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return elementData.toArray(new String[0]);//new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        elementData.add(s);
        elementData.add(s);
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        elementData = new ArrayList<>();
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {
        if((index&1)==1) {
            elementData.add(index + 1, element);
            elementData.add(index + 1, element);
        } else {
            elementData.add(index,element);
            elementData.add(index,element);
        }
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
