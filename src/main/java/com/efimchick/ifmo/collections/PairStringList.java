package com.efimchick.ifmo.collections;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class PairStringList implements List<String> {

    private ArrayList<String> list;

    public PairStringList() {
        this.list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "PairStringList{" +
                "elementData=" + list +
                '}';
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) list.toArray();
    }

    @Override
    public boolean add(String s) {
        list.add(s);
        list.add(s);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        list.remove(o);
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        c.forEach(x -> {list.add(x);
        list.add(x);
        });
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        AtomicInteger temp= new AtomicInteger();
        if(index%2!=0)
            temp.getAndIncrement();

        c.forEach(s -> {
            list.add(index+ temp.get(),s);
            list.add(index+ temp.get(),s);
            temp.getAndIncrement();
            temp.getAndIncrement();
        });
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void clear() {
        list = new ArrayList<>();
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public String set(int index, String element) {
        if(index%2==0)
            list.set(index+1,element);
        else
            list.set(index-1,element);
        return list.set(index,element);    }

    @Override
    public void add(int index, String element) {
        if((index&1)==1) {
            list.add(index + 1, element);
            list.add(index + 1, element);
        } else {
            list.add(index,element);
            list.add(index,element);
        }
    }

    @Override
    public String remove(int index) {
        if (index%2==0){
            list.remove(index+1);
            return list.remove(index);
        }
        list.remove(index-1);
        return list.remove(index-1);
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
