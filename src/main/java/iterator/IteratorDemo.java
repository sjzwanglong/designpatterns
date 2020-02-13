package iterator;

/**
 * 迭代器模式
 */
public class IteratorDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}


interface Iterator {
    public boolean hasNext();

    public Object next();
}

interface Container {
    public Iterator getIterator();
}

class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}