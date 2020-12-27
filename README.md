# Git commands
You can use this repository to familiarize with the most used git commands :
- clone
- checkout
- status
- add
- commit
- push
- branch
- merge
- mergetool
- rebase
- fetch

# Configure ssh

### Generate ssh key
ssh-keygen -t rsa -b 4096 -C your-emails@gmail.com

Do not change the name of the file : id_rsa
Do not change the directory : /c/User/aosih/.ssh/id_rsa
Accept …

### Check the ssh agent
ssh-agent -s

SSH_AUTH_SOCK=/tmp/ssh-JTpGA5GBUNMN/agent.9656; export SSH_AUTH_SOCK;

SSH_AGENT_PID=8972; export SSH_AGENT_PID;

echo Agent pid 8972;

### Copy the ssh key
clip < id_rsa.pub
ssh-rsa AAAAB3vyvoSVUKf5ozjdW+7OL35iNR1DhjIihBt9LFOwz6UQxEFTItdT6UHiYM8+xIr68TdW91tbt8n/VCPx1HTTwDnW5Zgoiu6xytLHXKeuN6GOEWl80F0wtzyXrEw5J2qx/TvxGXhTULIHmm9qjvHvo9qlArxu+CN6N41tPYz87iAAbXoMyYrDuOw2mRY748vIlpSgNTVvwGHBR11IzDmwMV78mLZX3fT+U1L44KfIEhuvIUJlaR0sDThF4daJo48YpEFsPQ5DtcarZiNb9IAqidKnbRSnQ1fd5Rd6y9PYuEVvL8ICxMZGHjja7bCtEZYg81ScB7H97DgorRANQ8c93jUcyDLa3zhJRnyjMqNrsd+Bja0y/VRNgCZVGH4keRUAVkxY+tjZLFIAd4sziNkHTld/wEGWEFLPw== mrdoogees@gmail.com

### Github : add ssh key
Github > Settings > SSH and GPG keys > New SSH key

### Test the ssh connection
ssh -T git@github.com

Hi mrdoogees! You've successfully authenticated, but GitHub does not provide shell access.

### Clone the repository
git clone ...

