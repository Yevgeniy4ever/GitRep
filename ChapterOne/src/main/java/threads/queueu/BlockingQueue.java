package threads.queueu;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public interface BlockingQueue {
}

/*
Lock lock = new ReentrantLock();
lock.lock();
try{
...
} finally {
    lock.unlock();

    }


    class Lock{
        int LockOwner;
        public void lock(){
            do{
                id = Thread.currentThread().getId();
                curId = lockOwner;
            } while (!CAS(lockOwner, curId, id);
        }
    }
 */


/*
synchronized void do(){
    ...
    }
    //or

void do() {
    synchronized(obj){
        ...
    }
}
 */