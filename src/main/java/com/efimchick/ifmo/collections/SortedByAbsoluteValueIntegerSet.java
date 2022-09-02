package com.efimchick.ifmo.collections;

import java.util.*;

class SortedByAbsoluteValueIntegerSet implements Set<Integer> {

    TreeSet<Integer> internal;

    public SortedByAbsoluteValueIntegerSet() {
        this.internal = new TreeSet<>(Comparator.comparing(Math::abs));
    }

    @Override
    public int size() {
        return internal.size();
    }

    @Override
    public boolean isEmpty() {
        return internal.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return internal.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return internal.iterator();
    }

    @Override
    public Object[] toArray() {
        return internal.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) internal.toArray();
    }

    @Override
    public boolean add(Integer integer) {
        return internal.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return internal.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return internal.contains(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return internal.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return internal.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return internal.removeAll(c);
    }

    @Override
    public void clear() {
        internal.clear();
    }
}
