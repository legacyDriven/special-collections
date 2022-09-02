package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue implements Queue<Integer> {

    private PriorityQueue<Integer> lowerHalf;
    private PriorityQueue<Integer> upperHalf;

    public MedianQueue() {
        lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        upperHalf = new PriorityQueue<>();
    }

    @Override
    public int size() {
        return lowerHalf.size() + upperHalf.size();
    }

    @Override
    public boolean isEmpty() {
        return upperHalf.isEmpty() && lowerHalf.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return lowerHalf.contains(o) || upperHalf.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        if(lowerHalf.size() >= upperHalf.size()) return lowerHalf.iterator();
        else return upperHalf.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
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
    public boolean addAll(Collection<? extends Integer> c) {
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
        lowerHalf.clear();
        upperHalf.clear();
    }

    @Override
    public boolean offer(Integer integer) {
        if (upperHalf.size() > 0 && integer > upperHalf.peek()) {
            upperHalf.add(integer);
        } else {
            lowerHalf.add(integer);
        }

        if (lowerHalf.size() - upperHalf.size() == 2) {
            upperHalf.add(lowerHalf.remove());
        } else if (upperHalf.size() - lowerHalf.size() == 2) {
            lowerHalf.add(upperHalf.remove());
        }
        return true;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        if (lowerHalf.size() >= upperHalf.size())
            return lowerHalf.remove();
        else
            return upperHalf.remove();
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        if (lowerHalf.size() >= upperHalf.size()) {
            return lowerHalf.peek();
        } else {
            return upperHalf.peek();
        }}
}
