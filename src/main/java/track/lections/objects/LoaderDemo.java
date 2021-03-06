package track.lections.objects;

import java.net.URI;

/**
 *
 */
public class LoaderDemo {

    public static void main(String[] args) throws Exception {
        //Loader loader = new XmlLoader();
        Loader loader = new NetLoader();
        Resource resource = loader.load(new URI("test-path"));
    }
}

class Resource {
    // класс с настройками
}

interface Loader {
    Resource load(URI uri);
}

class XmlLoader implements Loader {
    @Override
    public Resource load(URI uri) {
        // read XML and parse
        return new Resource();
    }
}

class NetLoader implements Loader {
    @Override
    public Resource load(URI uri) {
        // read Resources from internet
        return new Resource();
    }
}

