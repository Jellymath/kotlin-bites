package strangeWrapper;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;

public final class CollectionWrap<E>
        implements Iterable<E>, Collection<E>, List<E>, Set<E>, SortedSet<E>, NavigableSet<E>, Queue<E>, Deque<E> {

    private final Iterable<E> delegate;
    private final int which;
    private CollectionWrap(Iterable<E> delegate, int which) {
        this.delegate = delegate;
        this.which = which;
    }

    @Override public boolean equals(Object other) {
        return delegate.equals(other);
    }
    @Override public int hashCode() {
        return delegate.hashCode();
    }
    @Override public String toString() {
        return "Wrap(" + delegate.toString() + ')';
    }

    @Override public Iterator<E> iterator() {
        return delegate.iterator();
    }
    @Override public Spliterator<E> spliterator() {
        return delegate.spliterator();
    }

    @Override public int size() {
        return ((Collection<E>) delegate).size();
    }
    @Override public boolean isEmpty() {
        return ((Collection<E>) delegate).isEmpty();
    }
    @Override public boolean contains(Object o) {
        return ((Collection<E>) delegate).contains(o);
    }
    @Override public Object[] toArray() {
        return ((Collection<E>) delegate).toArray();
    }
    @Override public <T> T[] toArray(@NotNull T[] ts) {
        return ((Collection<E>) delegate).toArray(ts);
    }
    @Override public boolean add(E e) {
        return ((Collection<E>) delegate).add(e);
    }
    @Override public boolean remove(Object o) {
        return ((Collection<E>) delegate).remove(o);
    }
    @Override public boolean containsAll(@NotNull Collection<?> collection) {
        return ((Collection<E>) delegate).containsAll(collection);
    }
    @Override public boolean removeAll(@NotNull Collection<?> collection) {
        return ((Collection<E>) delegate).removeAll(collection);
    }
    @Override public boolean retainAll(@NotNull Collection<?> collection) {
        return ((Collection<E>) delegate).retainAll(collection);
    }
    @Override public void clear() {
        ((Collection<E>) delegate).clear();
    }
    @Override public boolean addAll(@NotNull Collection<? extends E> collection) {
        return ((Collection<E>) delegate).addAll(collection);
    }

    @Override public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        return ((List<E>) delegate).addAll(i, collection);
    }
    @Override public E get(int i) {
        return ((List<E>) delegate).get(i);
    }
    @Override public E set(int i, E e) {
        return ((List<E>) delegate).set(i, e);
    }
    @Override public void add(int i, E e) {
        ((List<E>) delegate).add(i, e);
    }
    @Override public E remove(int i) {
        return ((List<E>) delegate).remove(i);
    }
    @Override public int indexOf(Object o) {
        return ((List<E>) delegate).indexOf(o);
    }
    @Override public int lastIndexOf(Object o) {
        return ((List<E>) delegate).lastIndexOf(o);
    }
    @Override public ListIterator<E> listIterator() {
        return ((List<E>) delegate).listIterator();
    }
    @Override public ListIterator<E> listIterator(int i) {
        return ((List<E>) delegate).listIterator(i);
    }
    @Override public List<E> subList(int i, int i1) {
        return ((List<E>) delegate).subList(i, i1);
    }

    @Override public Comparator<? super E> comparator() {
        return ((SortedSet<E>) delegate).comparator();
    }
    @Override
    public SortedSet<E> subSet(E e, E e1) {
        return ((SortedSet<E>) delegate).subSet(e, e1);
    }
    @Override public SortedSet<E> headSet(E e) {
        return ((SortedSet<E>) delegate).headSet(e);
    }
    @Override public SortedSet<E> tailSet(E e) {
        return ((SortedSet<E>) delegate).tailSet(e);
    }
    @Override public E first() {
        return ((SortedSet<E>) delegate).first();
    }
    @Override public E last() {
        return ((SortedSet<E>) delegate).last();
    }

    @Override public E lower(E e) {
        return ((NavigableSet<E>) delegate).lower(e);
    }
    @Override public E floor(E e) {
        return ((NavigableSet<E>) delegate).floor(e);
    }
    @Override public E ceiling(E e) {
        return ((NavigableSet<E>) delegate).ceiling(e);
    }
    @Override public E higher(E e) {
        return ((NavigableSet<E>) delegate).higher(e);
    }
    @Override public NavigableSet<E> descendingSet() {
        return ((NavigableSet<E>) delegate).descendingSet();
    }
    @Override public NavigableSet<E> subSet(E e, boolean b, E e1, boolean b1) {
        return ((NavigableSet<E>) delegate).subSet(e, b, e1, b1);
    }
    @Override public NavigableSet<E> headSet(E e, boolean b) {
        return ((NavigableSet<E>) delegate).headSet(e, b);
    }
    @Override public NavigableSet<E> tailSet(E e, boolean b) {
        return ((NavigableSet<E>) delegate).tailSet(e, b);
    }

    @Override public boolean offer(E e) {
        return ((Queue<E>) delegate).offer(e);
    }
    @Override public E remove() {
        return ((Queue<E>) delegate).remove();
    }
    @Override public E poll() {
        return ((Queue<E>) delegate).poll();
    }
    @Override public E element() {
        return ((Queue<E>) delegate).element();
    }
    @Override public E peek() {
        return ((Queue<E>) delegate).peek();
    }

    @Override public void addFirst(E e) {
        ((Deque<E>) delegate).addFirst(e);
    }
    @Override public void addLast(E e) {
        ((Deque<E>) delegate).addLast(e);
    }
    @Override public boolean offerFirst(E e) {
        return ((Deque<E>) delegate).offerFirst(e);
    }
    @Override public boolean offerLast(E e) {
        return ((Deque<E>) delegate).offerLast(e);
    }
    @Override public E removeFirst() {
        return ((Deque<E>) delegate).removeFirst();
    }
    @Override public E removeLast() {
        return ((Deque<E>) delegate).removeLast();
    }
    @Override public E getFirst() {
        return ((Deque<E>) delegate).getFirst();
    }
    @Override public E getLast() {
        return ((Deque<E>) delegate).getLast();
    }
    @Override public E peekFirst() {
        return ((Deque<E>) delegate).peekFirst();
    }
    @Override public E peekLast() {
        return ((Deque<E>) delegate).peekLast();
    }
    @Override public boolean removeFirstOccurrence(Object o) {
        return ((Deque<E>) delegate).removeFirstOccurrence(o);
    }
    @Override public boolean removeLastOccurrence(Object o) {
        return ((Deque<E>) delegate).removeLastOccurrence(o);
    }
    @Override public void push(E e) {
        ((Deque<E>) delegate).push(e);
    }
    @Override public E pop() {
        return ((Deque<E>) delegate).pop();
    }

    @Override public E pollFirst() {
        switch (which) {
            case 5: return ((NavigableSet<E>) delegate).pollFirst();
            case 7: return ((Deque<E>) delegate).pollFirst();
            default: throw new UnsupportedOperationException();
        }
    }
    @Override public E pollLast() {
        switch (which) {
            case 5: return ((NavigableSet<E>) delegate).pollLast();
            case 7: return ((Deque<E>) delegate).pollLast();
            default: throw new UnsupportedOperationException();
        }
    }
    @Override public Iterator<E> descendingIterator() {
        switch (which) {
            case 5: return ((NavigableSet<E>) delegate).descendingIterator();
            case 7: return ((Deque<E>) delegate).descendingIterator();
            default: throw new UnsupportedOperationException();
        }
    }

    public static <E> Iterable<E> wrap(Iterable<E> original) {
        return new CollectionWrap<>(original, 0);
    }
    public static <E> Collection<E> wrap(Collection<E> original) {
        return new CollectionWrap<>(original, 1);
    }
    public static <E> List<E> wrap(List<E> original) {
        return new CollectionWrap<>(original, 2);
    }
    public static <E> Set<E> wrap(Set<E> original) {
        return new CollectionWrap<>(original, 3);
    }
    public static <E> Set<E> wrap(SortedSet<E> original) {
        return new CollectionWrap<>(original, 4);
    }
    public static <E> NavigableSet<E> wrap(NavigableSet<E> original) {
        return new CollectionWrap<>(original, 5);
    }
    public static <E> Queue<E> wrap(Queue<E> original) {
        return new CollectionWrap<>(original, 6);
    }
    public static <E> Deque<E> wrap(Deque<E> original) {
        return new CollectionWrap<>(original, 7);
    }

}
