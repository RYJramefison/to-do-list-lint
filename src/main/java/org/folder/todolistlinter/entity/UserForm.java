package org.folder.todolistlinter.entity;

public class UserForm {

    private final String username;
    private final String email;
    private final int age;


    public UserForm(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String username;
        private String email;
        private int age;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }


        public UserForm build() {
            validate();
            return new UserForm(this);
        }

        private void validate() {
            if (username == null || username.isBlank()) {
                throw new IllegalStateException("Username is required");
            }

            if (email == null || !email.contains("@")) {
                throw new IllegalStateException("Invalid email");
            }

            if (age < 18) {
                throw new IllegalStateException("User must be at least 18 years old");
            }
        }
    }

    public static void main(String[] args) {
        UserForm userForm = new UserForm.Builder()
                .username("juninho")
                .email("juninho@email.com")
                .age(22)
                .build();
        System.out.println(userForm);
    }
}

