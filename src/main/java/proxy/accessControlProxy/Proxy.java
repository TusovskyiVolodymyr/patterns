package proxy.accessControlProxy;

public class Proxy {
    private Resource resource;

    public void getDataFromResouce(int password) {
        if (password == 1234) {
            loadResource();
            resource.getSensitiveData();
        } else {
            System.out.println("Access denied!");
        }
    }

    private void loadResource() {
        if (resource == null) {
            resource = new Resource();
        }
    }
}

