Missing stuff :shipit:
======================
                
- [x] **Pretty Print** :shit:
  1. Needs to be updated, perhaps rewritten (would be a good task that resembles code generation)
  2. Implement a mechanism that uses the pretty print output on n run throughs to verify that no information is lost. 
- [x] **Matrix size in declaration** :metal:
  - [x] Change grammar.
  - [x] Implement in ast, and other visitors.
  - [x] Write tests.
- [x] **Importing files**     
  1. It should be possible to insert a given import files containing only function declarations.
  2. Figure out what kind of URI should be used e.g. relative or absolute.
  3. Decide when the file should be imported and if recursive importing should be possible.
  4. Implement the importing of files, maybe the ANTLR lexer/parser should add the contents to the token stream. 
- [x] **Floating point 16bit** :wine_glass:
  1. Is this even necessary and/or possible?
  2. If yes to both, implement it.
- [ ] **Complex return types**
  1. How should the C approach be? (hint pointers, malloc, memset, etc.)
  2. How should the OpenCL-C approach be?
  3. Implement it with excessive use of null checks among others. Remember to set the size/dimensions in the declaration variable! 
  4. Test, test, test. This element in the language is key, and should not be error prone.
- [x] **Internal functions** :blowfish:    
  1. Clean up the already existing rows and cols. Should be cleaner so further implementations are easier. 
- [ ] **stdlib.hlib** :bikini:
  1. *makeMatrix(n, m, value)*
  2. *sum(matrix | vector, matrix | vector)*
  3. Other matrix and vector related functions.
- [ ] **OpenCL code generations**
  1. What should be generated as OpenCL-kernels? Make LaTeX table and document in paper.
  2. How should the OpenCL-datatypes be integrated. Make LaTeX table again and present/argue why the datatypes are interesting.
  
  
