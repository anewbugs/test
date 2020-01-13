package com.wu.枚举;

public enum Status {
    A {
        @Override
        boolean isStarted() {
            return false;
        }

        @Override
        boolean isStopped() {
            return false;
        }

        @Override
        boolean isSuspended() {
            return false;
        }
    },
    RUNNING {
        @Override
        boolean isStarted() {
            return true;
        }

        @Override
        boolean isStopped() {
            return false;
        }

        @Override
        boolean isSuspended() {
            return false;
        }
    },
    STOPPED {
        @Override
        boolean isStarted() {
            return false;
        }

        @Override
        boolean isStopped() {
            return true;
        }

        @Override
        boolean isSuspended() {
            return false;
        }
    },
    SUSPENDED {
        @Override
        boolean isStarted() {
            return true;
        }

        @Override
        boolean isStopped() {
            return false;
        }

        @Override
        boolean isSuspended() {
            return true;
        }
    },
    UNSTARTED {
        @Override
        boolean isStarted() {
            return false;
        }

        @Override
        boolean isStopped() {
            return true;
        }

        @Override
        boolean isSuspended() {
            return false;
        }
    };

    abstract boolean isStarted();


    abstract boolean isStopped();

    abstract boolean isSuspended();
}
