public class December37 {
    public static void main(String[] args) {
        new Thread(new DecoratorRunnableIml(new DecoratorRunnableIml(new RunnableIml()))).start();
    }
    public static class RunnableIml implements Runnable{
        @Override
        public void run() {
            System.out.println("RunnableIml body");
        }
    }
    public static class DecoratorRunnableIml implements Runnable{
        private Runnable component;

        public DecoratorRunnableIml(Runnable component){
            this.component=component;
        }
        @Override
        public void run() {
            System.out.println("DecoratorRunnableIml body ");
            component.run();
        }
    }
    public static class DecoratorMyRunnable implements Runnable{
        private Runnable component;

        public DecoratorMyRunnable(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorMyRunnableIml body");
            component.run();
        }
    }
}
